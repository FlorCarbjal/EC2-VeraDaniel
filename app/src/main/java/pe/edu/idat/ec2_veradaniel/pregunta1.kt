package pe.edu.idat.ec2_veradaniel

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Pregunta1() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "AppIDAT") },
                navigationIcon = {
                    IconButton(onClick = { }) {
                        Icon(imageVector = Icons.Filled.ArrowBack, contentDescription = "")
                    }
                }
            )
        },
        content = { paddingValues ->
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues)
                    .padding(16.dp)
            ) {
                item { Cuestionario() }
            }
        }
    )
}

@Composable
fun Cuestionario() {
    var arrozConPollo by remember { mutableStateOf(false) }
    var lomoSaltado by remember { mutableStateOf(false) }
    var ajiDeGallina by remember { mutableStateOf(false) }
    var tallarines by remember { mutableStateOf(false) }
    var arrozChaufa by remember { mutableStateOf(false) }
    var otro by remember { mutableStateOf(false) }
    var visito by remember { mutableStateOf("NO") }
    var hablaIngles by remember { mutableStateOf("NO") }
    var gustaTecnologia by remember { mutableStateOf("NO") }
    var trabajoRemoto by remember { mutableStateOf("NO") }

    Column {
        Text(text = "CUESTIONARIO", fontSize = 24.sp, color = Color.Black)
        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "1. Marque sus platos favoritos.")
        Row(verticalAlignment = Alignment.CenterVertically) {
            Checkbox(checked = arrozConPollo, onCheckedChange = { arrozConPollo = it })
            Text(text = "Arroz con pollo")
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            Checkbox(checked = lomoSaltado, onCheckedChange = { lomoSaltado = it })
            Text(text = "Lomo Saltado")
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            Checkbox(checked = ajiDeGallina, onCheckedChange = { ajiDeGallina = it })
            Text(text = "Ají de gallina")
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            Checkbox(checked = tallarines, onCheckedChange = { tallarines = it })
            Text(text = "Tallarines")
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            Checkbox(checked = arrozChaufa, onCheckedChange = { arrozChaufa = it })
            Text(text = "Arroz Chaufa")
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            Checkbox(checked = otro, onCheckedChange = { otro = it })
            Text(text = "Otro")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "2. ¿Visitaste algún país de Europa, Asia o África?")
        Row(verticalAlignment = Alignment.CenterVertically) {
            RadioButton(selected = visito == "SI", onClick = { visito = "SI" })
            Text(text = "SI")
            RadioButton(selected = visito == "NO", onClick = { visito = "NO" })
            Text(text = "NO")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "3. ¿Hablas Inglés?")
        Row(verticalAlignment = Alignment.CenterVertically) {
            RadioButton(selected = hablaIngles == "SI", onClick = { hablaIngles = "SI" })
            Text(text = "SI")
            RadioButton(selected = hablaIngles == "NO", onClick = { hablaIngles = "NO" })
            Text(text = "NO")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "4. ¿Te gusta la tecnología?")
        Row(verticalAlignment = Alignment.CenterVertically) {
            RadioButton(selected = gustaTecnologia == "SI", onClick = { gustaTecnologia = "SI" })
            Text(text = "SI")
            RadioButton(selected = gustaTecnologia == "NO", onClick = { gustaTecnologia = "NO" })
            Text(text = "NO")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "5. ¿Realizas trabajo remoto?")
        Row(verticalAlignment = Alignment.CenterVertically) {
            RadioButton(selected = trabajoRemoto == "SI", onClick = { trabajoRemoto = "SI" })
            Text(text = "SI")
            RadioButton(selected = trabajoRemoto == "NO", onClick = { trabajoRemoto = "NO" })
            Text(text = "NO")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Resolver")
        }
    }
}