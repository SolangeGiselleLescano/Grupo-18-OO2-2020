package com.unla.Grupo18.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unla.Grupo18.entities.Producto;
import com.unla.Grupo18.repositories.IProductoRepository;

@Service
public class ProductServiceImpl implements IProductoService {
	
	private IProductoRepository iProductoRepository;
	
    @Autowired
    public void setProductRepository(IProductoRepository iProductoRepository) {
        this.iProductoRepository = iProductoRepository;
    }


    
	@Override
	public List<Producto> getAll() {
		// TODO Auto-generated method stub
		return iProductoRepository.findAll();
	}

	@Override
	public void insertOrUpdate(Producto producto) {
		   
		
		    producto.setProductosDescripcion(producto.getProductosDescripcion());
		    producto.setProductosPrecioUnitario(producto.getProductosPrecioUnitario());
		    //producto.setPrecioUnitario(producto.getPrecioUnitario());
		    
		    iProductoRepository.save(producto);
	}

	@Override
	public void remove(int idProducto) {
		// TODO Auto-generated method stub
		iProductoRepository.deleteById(idProducto);
		
	}


	@Override
	public Producto findByproductosId(int idProducto) {
		//return iProductoRepository.findByproductosId(idProducto);
		return iProductoRepository.findByproductosId(idProducto);
		
	}



	@Override
	public Producto findByproductosDescripcion(String descripcion) {
		
		return null;
	}
	

}
