package id.itguy.elearning.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import id.itguy.elearning.model.entity.UserMetadata

@Dao
interface UserMetadataDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(userMetadata: UserMetadata)

    @Query("SELECT * FROM user_metadata_table WHERE \"key\" LIKE :key LIMIT 1")
    fun findOneByKey(key: String): LiveData<UserMetadata>

    @Query("SELECT * FROM user_metadata_table ORDER BY \"key\" ASC")
    fun findAll(): LiveData<List<UserMetadata>>


}