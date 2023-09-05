package com.sinsa.recoll.Service;


import com.sinsa.recoll.DAO.RecollDAO;
import com.sinsa.recoll.VO.RecollVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RecollServiceImpl implements RecollService {
    @Autowired
    RecollDAO recollDAO;
    @Override
    public List<RecollVO> selectAllRecoll() throws Exception {
        return recollDAO.selectAllRecoll();
    }

    @Override
    public void insertRecoll(RecollVO recollVO) throws Exception {
        recollDAO.insertRecoll(recollVO);
    }

    @Override
    public RecollVO selectUpdate(int sno) throws Exception {
        return recollDAO.selectUpdate(sno);
    }

    @Override
    public void updateRecoll(RecollVO recollVO) throws Exception {
        recollDAO.updateRecoll(recollVO);
    }

    @Override
    public void deleteRecoll(int sno) throws Exception {
        recollDAO.deleteRecoll(sno);
    }
}
