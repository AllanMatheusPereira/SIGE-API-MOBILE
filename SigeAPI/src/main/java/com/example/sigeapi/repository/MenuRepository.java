    package com.example.sigeapi.repository;

    import com.example.sigeapi.model.Menu;
    import org.springframework.data.jpa.repository.JpaRepository;
    import org.springframework.stereotype.Repository;

    @Repository
    public interface MenuRepository extends JpaRepository <Menu, Integer>{
    }

