package com.example.teladeaplicativo2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.teladeaplicativo2.ui.theme.TelaDeAplicativo2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TelaDeAplicativo2Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    App()
                }
            }
        }
    }
}

@Composable
fun App(modifier: Modifier = Modifier){
    var textNome by remember { mutableStateOf("") }
    var textSexo by remember { mutableStateOf("") }
    var textIdade by remember { mutableStateOf("") }
    var textSenha by remember { mutableStateOf("") }
    var textEmail by remember { mutableStateOf("") }
    var textCidade by remember { mutableStateOf("") }
    var textEstado by remember { mutableStateOf("") }

    Column (
        Modifier
            .background(Color.White)
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
    )  {
        //coluna de título
        Row(
            Modifier
                .background(Color.Red)
                .padding(15.dp)
                .fillMaxWidth(),
                    Arrangement.Center
        ){
            Text(text = "NOW NEWS  --> Tela de Cadastro")
        }

        Row(
            Modifier
                .background(Color.White)
                .padding(15.dp)
                .fillMaxWidth(), Arrangement.Center
        ){
            Text(text = "Preencha os dados para se cadastrar-se no aplcativo do NOW NEWS!")
        }

        Row (Modifier .padding(10.dp)){} //espaçamento

        Row(
            Modifier
                .background(Color.White)
                .fillMaxWidth(),
            Arrangement.Center
        ){
            Text(text = "Dados Pessoais")
        }
        Row {
            OutlinedTextField(
                value = textNome,
                onValueChange = { textNome = it },
                label = { Text("Nome Completo") }
            )
        }

        Row {
            OutlinedTextField(
                value = textSexo,
                onValueChange = { textSexo = it },
                label = { Text("Sexo") }
            )
        }

        Row {
            OutlinedTextField(
                value = textIdade,
                onValueChange = { textIdade = it },
                label = { Text("Data de nascimento (xx/xx/xxxx)") }
            )
        }

        Row {
            OutlinedTextField(
                value = textEmail,
                onValueChange = { textEmail = it },
                label = { Text("Email (ex: fulano@gmail.com)") }
            )
        }

        Row {
            OutlinedTextField(
                value = textSenha,
                onValueChange = { textSenha = it },
                label = { Text("Definir senha") }
            )
        }

        Row (Modifier .padding(8.dp)){} //espaçamento
        Row (Modifier .padding(8.dp)){} //espaçamento

        Row(
            Modifier
                .background(Color.White)
                .fillMaxWidth(),
            Arrangement.Center
        ){
            Text(text = "Localidade")
        }
        Row {
            OutlinedTextField(
                value = textCidade,
                onValueChange = { textCidade = it },
                label = { Text("Cidade") }
            )
        }

        Row {
            OutlinedTextField(
                value = textEstado,
                onValueChange = { textEstado = it },
                label = { Text("Estado") }
            )
        }



        Row (Modifier .padding(15.dp)){} //espaçamento

        Row (modifier = modifier, horizontalArrangement = Arrangement.Absolute.Center)
        {
            Button(
                onClick = { /*TODO*/ }
            ) {
                Text(text = "Cadastrar-se")
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun AppPreview() {
    TelaDeAplicativo2Theme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            App()
        }
    }
}