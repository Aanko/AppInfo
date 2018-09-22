package cc.slogc.appmanager.repository;

import cc.slogc.appmanager.model.entity.AppInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Aanko on 2018/9/21.
 * @version 1.0
 */
public interface AppInfoRepository  extends JpaRepository<AppInfo, Long> {

}
