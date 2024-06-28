package com.example.mteladeaplicativo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mteladeaplicativo.ui.theme.MteladeAplicativoTheme
import kotlin.math.round

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MteladeAplicativoTheme {
                // A surface container using the 'background' color from the theme
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
fun App() {
    Column (
        modifier = Modifier
            .background(Color.White)
            .fillMaxWidth()

    ){
        //coluna de título
        Row(
            Modifier
                .background(Color.Red)
                .padding(15.dp)
                .fillMaxWidth(),
                    Arrangement.Center
        ){
            Text(text = "NOW NEWS")
        }

        //espaçamento
        Row (
            Modifier
                .padding(8.dp)
        ){}

        //PROXIMA NOTÍCIA***
        Column (
            Modifier
                .fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Row(
                Modifier
                    .background(Color.Gray)
                    .size(350.dp, 40.dp)
                    .padding(8.dp), Arrangement.Center
            ) {
                Text(text = "Luan Santana cria uma marca própria: 'LS'")
            }

            Row(
                Modifier
                    .background(Color.LightGray)
                    .size(350.dp, 65.dp)
                    .padding(8.dp)
            ) {
                Text(text = "No dia 20 de julho de 2024, " +
                        "Luan Santana anuncia sua nova marca de roupas, a LS.")

            }
            Row (
                Modifier
                    .background(Color.LightGray)
                    .size(350.dp, 53.dp)
                    .padding(8.dp, 0.dp)
            ){
                Button(
                    onClick = { /*TODO*/ }
                ) {
                    Text(text = "Leia Mais")
                }
            }
            //espaçamento
            Row (
                Modifier
                    .padding(8.dp)
            ){}


            //PROXIMA NOTÍCIA***
            Column (
                Modifier
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Row(
                    Modifier
                        .background(Color.Gray)
                        .size(350.dp, 40.dp)
                        .padding(8.dp), Arrangement.Center
                ) {
                    Text(text = "Justin Bieber fala sobre seu filho")
                }

                Row(
                    Modifier
                        .background(Color.LightGray)
                        .size(350.dp, 65.dp)
                        .padding(8.dp)
                ) {
                    Text(text = "Há uma semana, o cantor mostra ao público que terá um filho ainda esse ano.")

                }
                Row (
                    Modifier
                        .background(Color.LightGray)
                        .size(350.dp, 53.dp)
                        .padding(8.dp, 0.dp)
                ){
                    Button(
                        onClick = { /*TODO*/ }
                    ) {
                        Text(text = "Leia Mais")
                    }
                }
                //espaçamento
                Row (
                    Modifier
                        .padding(8.dp)
                ){}


                //PROXIMA NOTÍCIA***
                Column (
                    Modifier
                        .fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Row(
                        Modifier
                            .background(Color.Gray)
                            .size(350.dp, 40.dp)
                            .padding(8.dp), Arrangement.Center
                    ) {
                        Text(text = "Bruno Mars anuncia show beneficente")
                    }

                    Row(
                        Modifier
                            .background(Color.LightGray)
                            .size(350.dp, 65.dp)
                            .padding(8.dp)
                    ) {
                        Text(text = "Bruno Mars fará show beneficente para ajudar o Rio Grande do Sul no dia 30/06.")

                    }
                    Row (
                        Modifier
                            .background(Color.LightGray)
                            .size(350.dp, 53.dp)
                            .padding(8.dp, 0.dp)
                    ){
                        Button(
                            onClick = { /*TODO*/ }
                        ) {
                            Text(text = "Leia Mais")
                        }
                    }
                    //espaçamento
                    Row (
                        Modifier
                            .padding(8.dp)
                    ){}


                    //PROXIMA NOTÍCIA***
                    Column (
                        Modifier
                            .fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ) {
                        Row(
                            Modifier
                                .background(Color.Gray)
                                .size(350.dp, 40.dp)
                                .padding(8.dp), Arrangement.Center
                        ) {
                            Text(text = "Ana Maria Braga fala sobre o jogo")
                        }

                        Row(
                            Modifier
                                .background(Color.LightGray)
                                .size(350.dp, 65.dp)
                                .padding(8.dp)
                        ) {
                            Text(text = "Todos sabem do amor de Ana pelo time x, então ela falou sobre isso no seu programa.")

                        }
                        Row (
                            Modifier
                                .background(Color.LightGray)
                                .size(350.dp, 53.dp)
                                .padding(8.dp, 0.dp)
                        ){
                            Button(
                                onClick = { /*TODO*/ }
                            ) {
                                Text(text = "Leia Mais")
                            }
                        }
                        //espaçamento
                        Row (
                            Modifier
                                .padding(8.dp)
                        ){}
                    }
                }
            }
        }




    }
}

@Preview(showBackground = true)
@Composable
fun AppPreview() {
    MteladeAplicativoTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            App()
        }
    }
}