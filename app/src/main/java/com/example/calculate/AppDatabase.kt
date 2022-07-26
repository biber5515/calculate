package com.example.calculate

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.calculate.dao.HistoryDao
import com.example.calculate.model.History

@Database(entities = [History::class], version = 1)
abstract class AppDatabase : RoomDatabase(){
    abstract fun historyDao():HistoryDao
}