package com.star.repository;

import com.star.entity.DataSharing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import java.util.List;

/**
 * Created by hp on 2017/3/10.
 */
@Repository
public interface DataSharingRepository extends JpaRepository<DataSharing,Integer>{
    List<DataSharing> findByDataCollege(String college);
    //注意：@Query注解中的查询语句是HQL，而不是SQL
    @Query("from DataSharing data where concat(data.dataTitle,data.dataDescription,data.dataCategory,data.dataCollege) like ?")
    List<DataSharing> searchDataSharing(String key);
}
