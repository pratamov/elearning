package id.itguy.elearning.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import id.itguy.elearning.model.entity.Challenge

@Dao
interface ChallengeDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(challenge: Challenge)

    @Query("SELECT * FROM challenge_table WHERE id = :id LIMIT 1")
    fun findOneById(id: Integer): LiveData<Challenge>

    @Query("SELECT * FROM challenge_table ORDER BY created ASC")
    fun findAll(): LiveData<List<Challenge>>

    @Query("SELECT * FROM challenge_table WHERE purchased IS NOT NULL")
    fun findAllPurchased(): LiveData<List<Challenge>>

    @Query("SELECT * FROM challenge_table WHERE purchased IS NULL")
    fun findAllNotPurchased(): LiveData<List<Challenge>>

}