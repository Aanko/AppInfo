package cc.slogc.appmanager.repository;

import cc.slogc.appmanager.model.entity.DataDictionary;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 字典表持久层
 *
 * @author : RYAN0UP
 * @date : 2018/9/21
 */
public interface DataDictionaryRepository extends JpaRepository<DataDictionary, Long> {

}
