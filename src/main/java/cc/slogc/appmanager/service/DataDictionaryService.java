package cc.slogc.appmanager.service;

import cc.slogc.appmanager.model.entity.DataDictionary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author : RYAN0UP
 * @date : 2018/9/21
 */
public abstract class DataDictionaryService {

    /**
     * 添加字典
     *
     * @param dataDictionary dataDictionary
     */
    public abstract void add(DataDictionary dataDictionary);

    /**
     * 删除字典
     *
     * @param dataDictionary dataDictionary
     */
    public abstract void delete(DataDictionary dataDictionary);

    /**
     * 修改字典
     *
     * @param dataDictionary dataDictionary
     */
    public abstract void update(DataDictionary dataDictionary);

    /**
     * 列出所有字典
     *
     * @return List
     */
    public abstract List<DataDictionary> listAll();

    /**
     * 列出所有字典 分页
     *
     * @param pageable 分页信息
     * @return Page
     */
    public abstract Page<DataDictionary> listPage(Pageable pageable);

    /**
     * 根据id查询字典
     *
     * @param id id
     * @return DataDictionary
     */
    public abstract DataDictionary getById(Long id);
}
