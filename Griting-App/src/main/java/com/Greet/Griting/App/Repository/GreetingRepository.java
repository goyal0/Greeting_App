package com.Greet.Griting.App.Repository;

import com.Greet.Griting.App.Model.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingRepository extends JpaRepository<Greeting,Long>{
}
