package com.jacquigitau.glanceexperiment

import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.GlanceAppWidgetReceiver

/**
 * PROJECT NAME: Glance Experiment
 * USER        : jacqui
 * EMAIL       : gitaujaquiline@gmail.com
 * DATE        : Nov, 11/24/23
 * TIME        : 3:06 AM
 */
class QuotesWidgetReceiver: GlanceAppWidgetReceiver() {
    override val glanceAppWidget: GlanceAppWidget = QuotesWidget()
}