package pe.edu.idat.ec2_veradaniel

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

data class TestPsicologico(val titulo: String, val descripcion: String, val fecha: String)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Pregunta2() {
    var visible by remember { mutableStateOf(false) }
    val testPsicologicos = listOf(
        TestPsicologico("Personalidad", "test de personalidad", "01/07/2024"),
        TestPsicologico("Inteligencia", "test de inteligencia", "02/07/2024"),
        TestPsicologico("Ansiedad", "test de ansiedad", "03/07/2024"),
        TestPsicologico("Depresión", "test de depresión", "04/07/2024"),
        TestPsicologico("Estrés", "test de estrés", "05/07/2024"),
        TestPsicologico("Autoestima", "test de autoestima", "06/07/2024"),
        TestPsicologico("Relaciones", "test de relaciones", "07/07/2024"),
        TestPsicologico("Hábitos", "test de hábitos", "08/07/2024"),
        TestPsicologico("Sueño", "test de sueño", "09/07/2024"),
        TestPsicologico("Motivación", "test de motivación", "10/07/2024")
    )

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
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp)
        ) {
            Button(
                onClick = { visible = !visible },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = if (visible) "Ocultar " else "Tests")
            }
            if (visible) {
                Lista(testPsicologicos)
            }
        }
    }
}

@Composable
fun Lista(testPsicologicos: List<TestPsicologico>) {
    LazyColumn(
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
    ) {
        items(testPsicologicos) { testPsicologico ->
            Test(testPsicologico)
        }
    }
}

@Composable
fun Test(testPsicologico: TestPsicologico) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        colors = CardDefaults.cardColors(Color.White)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = testPsicologico.titulo, fontSize = 20.sp, color = Color.Black)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = testPsicologico.descripcion, fontSize = 16.sp, color = Color.Blue)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = testPsicologico.fecha, fontSize = 14.sp, color = Color.Blue)
        }
    }
}