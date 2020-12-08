
import React, { Component } from 'react';

import {
  View,
  StyleSheet,
  StatusBar,
  SafeAreaView,
  TextInput,
  Text,
  Dimensions,
  TouchableOpacity
} from 'react-native';

import axios from 'axios';

import Africastalking from 'africastalking-client'

import Feather from 'react-native-vector-icons/Feather';


class App extends Component {

  constructor() {
    super();
    this.onCallClick = this.onCallClick.bind(this);
    this.onHangUpClick = this.onHangUpClick.bind(this);

  }


  componentDidMount() {
    let config = {
      headers: {
        'Content-Type': 'application/json',
        'apiKey': 'your API Key'
      }
    };

    payload = {
      'phoneNumber': 'Your AT issued phone number',
      'clientName': 'yourBrowserClientUniqueIdentifier',
      'username': 'decoded'
    }

    let url = `https://webrtc.africastalking.com/capability-token/request`

    axios.post(url, payload, config)
      .then(response => {
        console.log(response.data);
        this.setState({
          token: response.data.token,
          client: new Africastalking.Client(token)
        })

      })
      .catch(error => {
        // display an error message
        console.log(error)
      })
  }

  state = {
    number: '',
    onCall: false,
    token: '',
    client: ''

  }


  callOrHangUpIcon() {
    if (this.state.onCall) {
      return (
        <TouchableOpacity
          onPress={this.onHangUpClick}

        >

          <Feather
            name="phone-off"
            color="#cb2d3e"
            size={40}
          />

        </TouchableOpacity>
      );
    } else {
      return (
        <TouchableOpacity
          onPress={this.onCallClick}
        >

          <Feather
            name="phone"
            color="green"
            size={40}
          />

        </TouchableOpacity>
      );
    }
  }

  onCallClick() {
    const {
      client,
      number
    } = this.state;

    if (client) {

      client.call(number)
      this.setState({
        onCall: true
      })

    }

  }

  onHangUpClick() {
    client.hangup()
    this.setState({
      onCall: false
    })
  }

  render() {

    const {
      mainContainer,
      textInputContainer,
      textTextInputSpecs,
    } = styles;
    return (
      <>
        <StatusBar backgroundColor="#ef473a" barStyle="light-content" />
        <SafeAreaView style={{ flex: 1 }}>
          <View style={mainContainer}>

            <View style={textInputContainer}>
              <TextInput
                placeholder="   phone number   "
                placeholderTextColor="rgba(204, 50, 50, 0.56)"
                value={this.state.name}
                onChangeText={value => this.setState({ number: value })}
                style={textTextInputSpecs}

              />

            </View>

            <View>
              {this.callOrHangUpIcon()}
            </View>


          </View>
        </SafeAreaView>
      </>

    );
  }
};

const {
  height, width
} = Dimensions.get('screen');

const styles = StyleSheet.create({

  mainContainer: {
    flex: 1,
    backgroundColor: '#b2b2b2',
    alignItems: 'center',
    justifyContent: 'center'
  },

  textInputContainer: {
    width: width * 0.9,
    backgroundColor: 'white',
    borderRadius: width * 0.1,
    marginVertical: height * 0.0145,
    alignItems: 'center',
    justifyContent: 'center',
  },

  textTextInputSpecs: {
    color: '#cb2d3e',
    fontSize: height * 0.03,
    paddingVertical: height * 0.0125,

  },

});

export default App;
