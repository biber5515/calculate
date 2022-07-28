package com.example.calculate.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.calculate.model.History

@Dao
interface HistoryDao{
    @Query("SELECT * FROM history")
    fun getAll():List<History>

    @Insert
    fun insertHistroy(history: History)

    @Query("DELETE FROM history")
    fun deleteAll()


}