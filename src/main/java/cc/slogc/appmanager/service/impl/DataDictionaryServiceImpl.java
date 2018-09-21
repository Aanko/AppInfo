package cc.slogc.appmanager.service.impl;

import cc.slogc.appmanager.model.entity.DataDictionary;
import cc.slogc.appmanager.repository.DataDictionaryRepository;
import cc.slogc.appmanager.service.DataDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * 业务实现
 *
 * @author : RYAN0UP
 * @date : 2018/9/21
 */
@Service
public class DataDictionaryServiceImpl extends DataDictionaryService {

    @Autowired
    private DataDictionaryRepository dataDictionaryRepository;

    /**
     * 添加字典
     *
     * @param dataDictionary dataDictionary
     */
    @Override
    public void add(DataDictionary dataDictionary) {
        //添加时设置创建时间和更新时间为当前时间
        dataDictionary.setCreationDate(new Date());
        dataDictionary.setModifyDate(new Date());
        dataDictionaryRepository.save(dataDictionary);
    }

    /**
     * 删除字典
     *
     * @param dataDictionary dataDictionary
     */
    @Override
    public void delete(DataDictionary dataDictionary) {
        dataDictionaryRepository.delete(dataDictionary);
    }

    /**
     * 修改字典
     *
     * @param dataDictionary dataDictionary
     */
    @Override
    public void update(DataDictionary dataDictionary) {
        //修改时修改更新时间
        dataDictionary.setModifyDate(new Date());
        dataDictionaryRepository.save(dataDictionary);
    }

    /**
     * 列出所有字典
     *
     * @return List
     */
    @Override
    public List<DataDictionary> listAll() {
        return dataDictionaryRepository.findAll();
    }

    /**
     * 列出所有字典 分页
     *
     * @param pageable 分页信息
     * @return Page
     */
    @Override
    public Page<DataDictionary> listPage(Pageable pageable) {
        return dataDictionaryRepository.findAll(pageable);
    }

    /**
     * 根据id查询字典
     *
     * @param id id
     * @return DataDictionary
     */
    @Override
    public DataDictionary getById(Long id) {
        return dataDictionaryRepository.getOne(id);
    }
}
