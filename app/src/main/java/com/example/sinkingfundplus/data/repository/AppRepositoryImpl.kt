package com.example.sinkingfundplus.data.repository

import com.example.sinkingfundplus.data.database.AppDao
import com.example.sinkingfundplus.data.database.AppLogEntity
import com.example.sinkingfundplus.domain.repository.AppRepository
import kotlinx.coroutines.flow.Flow
import java.util.UUID
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AppRepositoryImpl @Inject constructor(
    private val appDao: AppDao
) : AppRepository {
    override fun getLogs(): Flow<List<AppLogEntity>> = appDao.getLogs()

    override suspend fun addLog(title: String, content: String) {
        appDao.insertLog(AppLogEntity(UUID.randomUUID().toString(), title, content, System.currentTimeMillis()))
    }
}
