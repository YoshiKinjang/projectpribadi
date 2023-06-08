package com.quick.projekpribadi.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.quick.projekpribadi.R
import com.quick.projekpribadi.ui.theme.ProjekPribadiTheme

@Composable
fun LoginScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .padding(
                horizontal = dimensionResource(R.dimen.padding_megabig),
                vertical = dimensionResource(
                    id = R.dimen.padding_big
                )
            )
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Image(
            painter = painterResource(R.drawable.loginsplashillus),
            contentDescription = null,
            modifier = modifier.size(dimensionResource(R.dimen.image_size))
        )
        LoginScreenInput()
        Spacer(modifier = modifier.size(16.dp))

    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreenInput(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(
            text = stringResource(R.string.login_info),
            style = MaterialTheme.typography.displaySmall,
            modifier = modifier.padding(vertical = dimensionResource(R.dimen.padding_mini))
        )
        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text("Username", style = MaterialTheme.typography.bodyMedium) },
            singleLine = true,
            textStyle = MaterialTheme.typography.bodyMedium,
            modifier = modifier
                .fillMaxWidth()
                .padding(vertical = dimensionResource(R.dimen.padding_mini))
        )
        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text(text ="Password", style = MaterialTheme.typography.bodyMedium) },
            singleLine = true,
            textStyle = MaterialTheme.typography.bodyMedium,
            colors = TextFieldDefaults.outlinedTextFieldColors(MaterialTheme.colorScheme.primary),
            modifier = modifier
                .fillMaxWidth()
                .padding(vertical = dimensionResource(R.dimen.padding_mini))
        )
        Row(
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically,
            modifier = modifier.fillMaxWidth()
        ) {
            Checkbox(
                checked = false,
                onCheckedChange = {},
            )
            Text(
                text = stringResource(R.string.remember_me),
                style = MaterialTheme.typography.bodyMedium
            )
        }
        Divider(modifier = modifier.padding(vertical = dimensionResource(R.dimen.padding_medium)))
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text(stringResource(R.string.button_login))
        }
        Spacer(modifier = Modifier.size(16.dp))
        Text(
            text = stringResource(R.string.report),
            style = MaterialTheme.typography.bodyMedium,
        )
    }
}

/*@Composable
fun LoginScreenConfirm(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick = { *//*TODO*//* },
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text(stringResource(R.string.button_login))
        }
        Spacer(modifier = Modifier.size(16.dp))
        Text(
            text = stringResource(R.string.report),
            style = MaterialTheme.typography.bodyMedium,
        )
    }
}*/

@Preview (showSystemUi = true)
@Composable
fun HomeScreenPreview() {
    ProjekPribadiTheme() {
        LoginScreen()
    }
}