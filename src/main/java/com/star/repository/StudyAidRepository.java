package com.star.repository;

import com.star.entity.HelpAid;
import com.star.entity.StudyAid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by hp on 2017/3/10.
 */
@Repository
public interface StudyAidRepository extends JpaRepository<StudyAid,Integer>{

}
