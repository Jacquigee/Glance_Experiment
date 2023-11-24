package com.jacquigitau.glanceexperiment

import android.content.Context
import androidx.glance.GlanceId
import androidx.glance.text.Text
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.provideContent
import androidx.glance.state.GlanceStateDefinition
import androidx.glance.state.PreferencesGlanceStateDefinition

/**
 * PROJECT NAME: Glance Experiment
 * USER        : jacqui
 * EMAIL       : gitaujaquiline@gmail.com
 * DATE        : Nov, 11/24/23
 * TIME        : 2:58 AM
 */
class QuotesWidget: GlanceAppWidget() {
    override val stateDefinition: GlanceStateDefinition<*> = PreferencesGlanceStateDefinition

    override suspend fun provideGlance(context: Context, id: GlanceId) {
        provideContent {
            Text(text = "Hello World!")
        }
    }
}