package com.example.sinkingfundplus.domain.repository

import com.example.sinkingfundplus.data.database.AppLogEntity
import kotlinx.coroutines.flow.Flow

interface AppRepository {
    fun getLogs(): Flow<List<AppLogEntity>>
    suspend fun addLog(title: String, content: String)
}
