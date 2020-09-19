import React from 'react';
import Home from './src/pages/home'
import Routes from './src/routes'

import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, View } from 'react-native';
import { AppLoading } from 'expo'
import {
  useFonts,
  Play_400Regular,
  Play_700Bold,
} from '@expo-google-fonts/play'


export default function App() {

  const [fontsLoaded] = useFonts({
    Play_400Regular,
    Play_700Bold
  })

  const styles = StyleSheet.create({
    container: {
      flex: 1
    }
  })

  if (!fontsLoaded) {
    return <AppLoading />
  } else {
    return (
      <View style={styles.container}>
        <Routes />
        <StatusBar style="light" />
      </View>
    );
  }
}


