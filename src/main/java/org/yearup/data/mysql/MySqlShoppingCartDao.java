package org.yearup.data.mysql;


import org.springframework.stereotype.Component;
import org.yearup.data.ShoppingCartDao;
import org.yearup.models.ShoppingCart;

import javax.sql.DataSource;
import java.sql.SQLException;

@Component
public class MySqlShoppingCartDao extends MySqlDaoBase implements ShoppingCartDao {

    public MySqlShoppingCartDao(DataSource dataSource){super(dataSource);}


    @Override
    public ShoppingCart getByUserId(int userId) throws SQLException {
        return null;
    }

    @Override
    public void addProduct(int userId, int productId) throws SQLException {

    }

    @Override
    public void updateQuantity(int userId, int productId, int quantity) throws SQLException {

    }

    @Override
    public void clearCart(int userId) throws SQLException {

    }
}
