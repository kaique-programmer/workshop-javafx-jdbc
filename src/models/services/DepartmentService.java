package models.services;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;

public class DepartmentService {
    private DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

    public List<Department> findAll() {
        return departmentDao.findAll();
    }

    public void saveOrUpdate(Department department) {
        if (department.getId() == null) {
            departmentDao.insert(department);
        } else {
            departmentDao.update(department);
        }
    }
}
