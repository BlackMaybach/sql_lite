package com.example.sql.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.sql.dao.UserDao
import com.example.sql.entities.User

@Database(entities = [User::class], version = 1)
abstract class AppDataBase : RoomDatabase() {

    abstract fun userDao() : UserDao


}