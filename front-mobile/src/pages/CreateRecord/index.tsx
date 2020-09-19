import React from 'react'
import Header from '../../components/Header'

import { Text, StyleSheet} from 'react-native'
import { useNavigation } from '@react-navigation/native'

const CreateRecord = () => {

   

    return (
        <>
            <Header />
            <Text style={styles.text}>Hello</Text>
        </>
    )      
}

const styles = StyleSheet.create({
    text: {
        color: '#FFF',
        fontSize: 60,
        textAlign: 'center',
        marginTop: 100
    }
})

export default CreateRecord