//package com.cms.survey.repository;
//import java.util.List;
//import org.springframework.data.jpa.repository.JpaRepository;
//import com.cms.survey.model.SurveyScheduleConfig;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//
//public interface SurveyScheduleConfigRepository extends JpaRepository<SurveyScheduleConfig, Long> {
//
//  List<SurveyScheduleConfig> findByScheduleId(Integer scheduleId);
//  List<SurveyScheduleConfig> findLatestByScheduleId(Integer scheduleId);
//
//  @Query("SELECT s FROM SurveyScheduleConfig s WHERE s.scheduleId = :scheduleId ORDER BY s.id DESC limit 1")
//  List<SurveyScheduleConfig> findLatestOneByScheduleId(@Param("scheduleId") Integer scheduleId);
//
//}