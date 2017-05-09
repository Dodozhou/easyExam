package com.star.repository;

import com.star.entity.DataSharing;
import com.star.entity.User;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

/**
 * Created by hp on 2017/3/10.
 */
@Repository
public interface DataSharingRepository extends JpaRepository<DataSharing,Integer>{
    List<DataSharing> findByDataCollege(String college);
}
