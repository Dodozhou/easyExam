package com.star.repository;

import com.star.entity.DocSeek;
import com.star.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by hp on 2017/3/10.
 */
@Repository
public interface DocSeekRepository extends JpaRepository<DocSeek,Integer>{

}
