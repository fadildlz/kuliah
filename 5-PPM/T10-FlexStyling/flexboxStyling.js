import React, { Component } from 'react';
import { Platform, StyleSheet, View, Button, Text } from "react-native";

export default class App extends Component {


  render() {
    return (
      <View style={styles.container}>

        <View style={{ backgroundColor: 'white', flex: 1, flexDirection: 'row', justifyContent: 'center', alignItems: 'center' }}>
          <Text>X</Text>
        </View>

        <View style={{ backgroundColor: 'lightblue', flex: 1, flexDirection: 'column', justifyContent: 'center' }}>

          <View style={{ flex: 1, flexDirection: 'row' }}>
            <Text style={{ backgroundColor: 'lightwhite', flex: 1, textAlignVertical: 'center', textAlign: 'center' }}>BOX 1</Text>
            <Text style={{ backgroundColor: 'lightyellow', flex: 1, textAlignVertical: 'center', textAlign: 'center' }}> BOX 2</Text>
            <Text style={{ backgroundColor: 'lightgreen', flex: 1, textAlignVertical: 'center', textAlign: 'center' }}>BOX 3</Text>
            <Text style={{ backgroundColor: 'lightblue', flex: 1, textAlignVertical: 'center', textAlign: 'center' }}>BOX 4</Text>
            <Text style={{ backgroundColor: 'lightred', flex: 1, textAlignVertical: 'center', textAlign: 'center' }}>BOX 5</Text>
          </View>

          <View style={{ flex: 1, flexDirection: 'row' }}>
            <Text style={{ backgroundColor: 'red', flex: 1, textAlignVertical: 'center', textAlign: 'center' }}>BOX 1</Text>
            <Text style={{ backgroundColor: 'yellow', flex: 1, textAlignVertical: 'center', textAlign: 'center' }}> BOX 2</Text>
          </View>


          <View style={{ flex: 1, flexDirection: 'row', }}>
            <Text style={{ backgroundColor: 'lightred', flex: 1, textAlignVertical: 'center', textAlign: 'center' }}>BOX 1</Text>
            <Text style={{ backgroundColor: 'lightblue', flex: 1, textAlignVertical: 'center', textAlign: 'center' }}>BOX 2</Text>
            <Text style={{ backgroundColor: 'ligehtgreen', flex: 1, textAlignVertical: 'center', textAlign: 'center' }}>BOX 3</Text>
            <Text style={{ backgroundColor: 'lightyellow', flex: 1, textAlignVertical: 'center', textAlign: 'center' }}>BOX 4</Text>
            <Text style={{ backgroundColor: 'lightggrey', flex: 1, textAlignVertical: 'center', textAlign: 'center' }}>BOX 5</Text>
          </View>

        </View>

      </View>

    );
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',

  },
  headerText: {
    fontSize: 20,
    textAlign: "center",
    margin: 10,
    fontWeight: "bold"
  },

});