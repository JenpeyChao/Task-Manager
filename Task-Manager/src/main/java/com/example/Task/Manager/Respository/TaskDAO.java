package com.example.Task.Manager.Respository;

import com.example.Task.Manager.Entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskDAO extends JpaRepository<Task,Long>{
}
