package com.example.sql.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.sql.entities.User

@Dao
interface UserDao {
@Query("SELECT * FROM user")
    fun getAllUsers(): List<User>

    @Insert
    fun addUser(vararg user:User)

    @Delete
    fun deleteUser(user: User)
}