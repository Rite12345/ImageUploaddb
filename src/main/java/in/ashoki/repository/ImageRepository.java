package in.ashoki.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashoki.entity.Image;

@Repository
public interface ImageRepository extends JpaRepository<Image,Long>{
	

}
