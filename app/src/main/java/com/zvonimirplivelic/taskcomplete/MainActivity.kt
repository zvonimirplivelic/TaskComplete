package com.zvonimirplivelic.taskcomplete

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.zvonimirplivelic.taskcomplete.ui.theme.TaskCompleteTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskCompleteTheme {
                TaskComplete()
            }
        }
    }
}

@Composable
fun TaskComplete() {
    val image = painterResource(R.drawable.ic_task_completed)

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = image,
            contentDescription = "Done image",
            modifier = Modifier
                .wrapContentWidth()
                .wrapContentHeight(),
            contentScale = ContentScale.Crop
        )
        Text(
            text = stringResource(R.string.tasks_complete_text),
            fontSize = 24.sp,
            modifier = Modifier.padding(top = 24.dp, bottom = 24.dp)
        )
        Text(
            text = stringResource(R.string.nice_work_text),
            fontSize = 16.sp
        )
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TaskCompleteTheme {
        TaskComplete()
    }
}