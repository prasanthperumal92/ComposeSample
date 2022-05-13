package com.example.composesample.views

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.composesample.R


    @Preview
    @Composable
    fun SearchBar(
                  modifier: Modifier = Modifier,
                  onQuery:((text:String)->Unit)? =null,onClosed:(()->Unit)?=null){




        TextField(
            value = "",
            onValueChange = {},
            modifier = modifier
                .heightIn(min = 36.dp)
                .fillMaxWidth(),
            leadingIcon = {
                Icon(imageVector = Icons.Default.Search,
                    contentDescription = "")
            },
            placeholder = {
                Text(text = stringResource(id = R.string.search))
            },
            colors = TextFieldDefaults.textFieldColors(
                focusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent,
                errorIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                backgroundColor = MaterialTheme.colors.surface

            ),
            trailingIcon = {
                Icon(imageVector = Icons.Default.Close, contentDescription = "")
            }
        )
    }

    @Composable
    fun SearchBarClose(text: State<String>, onClosed:(()->Unit)?=null){

    }



