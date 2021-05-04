package model.services;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

import java.util.List;

public class SellerService {
    private SellerDao sellerDao = DaoFactory.createSellerDao();

    public List<Seller> findAll() {
        return sellerDao.findAll();
    }

    public void saveOrUpdate(Seller Seller) {
        if (Seller.getId() == null) {
            sellerDao.insert(Seller);
        } else {
            sellerDao.update(Seller);
        }
    }

    public void remove(Seller Seller) {
        sellerDao.deleteById(Seller.getId());
    }
}
