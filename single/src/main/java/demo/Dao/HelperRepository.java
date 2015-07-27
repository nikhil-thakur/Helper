package demo.Dao;

import demo.model.Helper;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by nikhi_000 on 7/27/2015.
 */
public interface HelperRepository extends MongoRepository<Helper, String> {
}
