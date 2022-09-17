package com.applegarthapps.presentation.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.applegarthapps.data.model.local.Note
import com.applegarthapps.presentation.ui.theme.cardBackground
import java.time.format.DateTimeFormatter

@Composable
fun NoteRow(
    modifier: Modifier = Modifier,
    note: Note,
    onNoteClick: (Note) -> Unit,

    ) {
    Surface(
        modifier
            .padding(4.dp)
            .fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        color = MaterialTheme.colors.cardBackground,
        elevation = 6.dp,
    ) {
        Column(
            modifier
                .clickable { }
                .padding(horizontal = 6.dp, vertical = 6.dp),
            horizontalAlignment = Alignment.Start
        )
        {
            Icon(
                imageVector = Icons.Default.Edit,
                contentDescription = "Edit icon",
                modifier = Modifier
                    .padding(end = 16.dp)
                    //.clickable { onNoteClick }
                    .align(Alignment.End)


                )
            Text(
                text = note.title,
                style = MaterialTheme.typography.h6
            )
            Text(
                text = note.description,
                style = MaterialTheme.typography.body2
            )
//            Text(
//                text = note.entryDate.format(DateTimeFormatter.BASIC_ISO_DATE),
//                style = MaterialTheme.typography.caption
//            )
            Icon(
                imageVector = Icons.Default.Delete,
                contentDescription = "Edit icon",
                modifier = Modifier
                    .padding(end = 16.dp)
                    .clickable { onNoteClick(note) }
                    .align(Alignment.End)
            )

        }
    }


}
