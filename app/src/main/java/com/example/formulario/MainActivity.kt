package com.example.formulario

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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxColors
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.formulario.ui.theme.FormularioTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FormularioTheme {
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
    var name by remember { mutableStateOf("") }
    var cpf by remember { mutableStateOf("") }
    var cep by remember { mutableStateOf("") }
    var tel by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var checked by remember { mutableStateOf(false) }

    Column(
        Modifier
            .background(Color(23, 23, 23))
            .fillMaxWidth()
            .verticalScroll(rememberScrollState())
    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .background(Color(23, 23, 23)),
            Arrangement.Center
        ){
            Text(
                text = "App Formulário",
                fontFamily = FontFamily.SansSerif,
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
        }
        Row(
            Modifier
                .fillMaxWidth()
                .padding(20.dp)
        ) {

        }
        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            TextField(
                value = name,
                onValueChange = {name = it},
                // O it recebe no tempo exato o que o usuário está fazendo e atribui a name
                label = { Text("Nome completo:")},
                colors = TextFieldDefaults.colors(
                    unfocusedIndicatorColor = Color(48,48,48),
                    unfocusedLabelColor = Color.White,
                    unfocusedContainerColor = Color(48,48,48),
                    unfocusedTextColor = Color.White,

                    focusedIndicatorColor = Color(48, 48, 48),
                    focusedLabelColor = Color.White,
                    focusedContainerColor = Color(48,48,48),
                    focusedTextColor = Color.White,

                    cursorColor = Color.White
                ),
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Text,
                    // Serve para quando der o enter ele ir para o próximo campo
                    imeAction = ImeAction.Next
                )
            )
        }
        Row(
            Modifier
                .fillMaxWidth()
                .padding(20.dp)
        ) {

        }
        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            TextField(
                value = cpf,
                onValueChange = {cpf = it},
                // O it recebe no tempo exato o que o usuário está fazendo e atribui a name
                label = { Text("CPF:")},
                colors = TextFieldDefaults.colors(
                    unfocusedIndicatorColor = Color(48,48,48),
                    unfocusedLabelColor = Color.White,
                    unfocusedContainerColor = Color(48,48,48),
                    unfocusedTextColor = Color.White,

                    focusedIndicatorColor = Color(48, 48, 48),
                    focusedLabelColor = Color.White,
                    focusedContainerColor = Color(48,48,48),
                    focusedTextColor = Color.White,

                    cursorColor = Color.White
                ),
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Number,
                    // Serve para quando der o enter ele ir para o próximo campo
                    imeAction = ImeAction.Next
                )
            )
        }
        Row(
            Modifier
                .fillMaxWidth()
                .padding(20.dp)
        ) {

        }
        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            TextField(
                value = cep,
                onValueChange = {cep = it},
                // O it recebe no tempo exato o que o usuário está fazendo e atribui a name
                label = { Text("CEP:")},
                colors = TextFieldDefaults.colors(
                    unfocusedIndicatorColor = Color(48,48,48),
                    unfocusedLabelColor = Color.White,
                    unfocusedContainerColor = Color(48,48,48),
                    unfocusedTextColor = Color.White,

                    focusedIndicatorColor = Color(48, 48, 48),
                    focusedLabelColor = Color.White,
                    focusedContainerColor = Color(48,48,48),
                    focusedTextColor = Color.White,

                    cursorColor = Color.White
                ),
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Number,
                    // Serve para quando der o enter ele ir para o próximo campo
                    imeAction = ImeAction.Next
                )
            )
        }
        Row(
            Modifier
                .fillMaxWidth()
                .padding(20.dp)
        ) {

        }
        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            TextField(
                value = tel,
                onValueChange = {tel = it},
                // O it recebe no tempo exato o que o usuário está fazendo e atribui a name
                label = { Text("Telefone:")},
                colors = TextFieldDefaults.colors(
                    unfocusedIndicatorColor = Color(48,48,48),
                    unfocusedLabelColor = Color.White,
                    unfocusedContainerColor = Color(48,48,48),
                    unfocusedTextColor = Color.White,

                    focusedIndicatorColor = Color(48, 48, 48),
                    focusedLabelColor = Color.White,
                    focusedContainerColor = Color(48,48,48),
                    focusedTextColor = Color.White,

                    cursorColor = Color.White
                ),
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Number,
                    // Serve para quando der o enter ele ir para o próximo campo
                    imeAction = ImeAction.Next
                )
            )
        }
        Row(
            Modifier
                .fillMaxWidth()
                .padding(20.dp)
        ) {

        }
        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            TextField(
                value = password,
                onValueChange = {password = it},
                // O it recebe no tempo exato o que o usuário está fazendo e atribui a name
                label = { Text("Senha:")},
                colors = TextFieldDefaults.colors(
                    unfocusedIndicatorColor = Color(48,48,48),
                    unfocusedLabelColor = Color.White,
                    unfocusedContainerColor = Color(48,48,48),
                    unfocusedTextColor = Color.White,

                    focusedIndicatorColor = Color(48, 48, 48),
                    focusedLabelColor = Color.White,
                    focusedContainerColor = Color(48,48,48),
                    focusedTextColor = Color.White,

                    cursorColor = Color.White
                ),
                visualTransformation = PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
            )
        }
        Row(
            Modifier
                .fillMaxWidth()
                .padding(20.dp)
        ) {

        }
        Row(
            Modifier
                .fillMaxWidth()
                .padding(60.dp, 10.dp, 10.dp),
            Arrangement.Absolute.Left,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Lembrar a senha",
                color = Color.White
            )
            Checkbox(
                checked = checked, onCheckedChange = {checked = it},
                colors = CheckboxDefaults.colors(Color(255, 199, 69), checkmarkColor = Color.Black)
            )
        }
        Row(
            Modifier
                .fillMaxWidth()
                .padding(20.dp)
        ) {

        }
        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(containerColor = Color(255, 199, 69), contentColor = Color.Black)
            ) {
                Text(text = "Cadastrar")
            }
        }
    }
}

@Preview
@Composable
fun AppPreview() {
    FormularioTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            App()
        }
    }
}