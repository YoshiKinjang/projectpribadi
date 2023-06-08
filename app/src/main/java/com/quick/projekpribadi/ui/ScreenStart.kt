package com.quick.projekpribadi.ui


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.quick.projekpribadi.R
import com.quick.projekpribadi.ui.theme.ProjekPribadiTheme

@Composable
fun StartScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .padding(dimensionResource(R.dimen.padding_megabig))
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        StartScreenSplash()

        Spacer(modifier = Modifier.size(32.dp))

        Column() {
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    MaterialTheme.colorScheme.primary
                ),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = stringResource(R.string.button_login))
            }
            OutlinedButton(
                onClick = { /*TODO*/ },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = stringResource(R.string.button_askOp))
            }
        }
    }
}


@Composable
fun StartScreenSplash(modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        Image(
            painter = painterResource(R.drawable.startsplashillus),
            contentDescription = null,
            modifier = modifier.size(dimensionResource(R.dimen.image_size))
        )
        Text(
            text = stringResource(R.string.header_start),
            style = MaterialTheme.typography.displayLarge,
            modifier = modifier.padding(dimensionResource(R.dimen.padding_medium))
        )
        Text(
            text = stringResource(R.string.body_start),
            style = MaterialTheme.typography.bodyLarge,
            textAlign = TextAlign.Center,
        )
    }
}



@Preview(showSystemUi = true, apiLevel = 21, device = "spec:width=411dp,height=891dp")
@Composable
fun StartScreenPreview() {
    ProjekPribadiTheme {
        StartScreen()
    }
}