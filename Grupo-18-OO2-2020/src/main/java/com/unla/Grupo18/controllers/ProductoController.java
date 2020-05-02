package com.unla.Grupo18.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import com.unla.Grupo18.entities.Producto;
import com.unla.Grupo18.herlpers.ViewRouteHelper;
import com.unla.Grupo18.services.IProductoService;


@Controller
@RequestMapping("/producto")
public class ProductoController {
	
	@Autowired
	
	private IProductoService productoService;
	
	@GetMapping("")
	public ModelAndView index() {

		ModelAndView mAV = new ModelAndView(ViewRouteHelper.PRODUCTO_INDEX);
		mAV.addObject("productos", productoService.getAll());
		return mAV;
	}
	
	@GetMapping("/new")
	public ModelAndView create() {
		
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.PRODUCTO_NEW);
		mAV.addObject("producto", new Producto());		
		return mAV;
	}
	
	@GetMapping("/create")
	public RedirectView create(@ModelAttribute("producto") Producto producto) {
		//System.out.println("Estoy en create");
		productoService.insertOrUpdate(producto);
		return new RedirectView(ViewRouteHelper.PRODUCTO_ROOT); 
	}
	
	@GetMapping("/{id}")
	public ModelAndView get(@PathVariable("id") int id) {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.PRODUCTO_INFO);
		//System.out.println(productoService.findByIdProducto(id).getDescripcion());
		mAV.addObject("producto", productoService.findByIdProducto(id));
		return mAV;
		//return null;
	}
	
	@GetMapping("/by_name/{name}")
	public ModelAndView getByName(@PathVariable("name") String name) {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.PRODUCTO_UPDATE);
		mAV.addObject("producto", productoService.findByDescripcion(name));
		return mAV;
	}
	
	
	@GetMapping("/update/{id}")
	public ModelAndView update(@PathVariable("id") int id) {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.PRODUCTO_UPDATE);
		mAV.addObject("producto", productoService.findByIdProducto(id));
		return mAV;
		
	}
	
	@GetMapping("/delete/{id}")
	public RedirectView delete(@PathVariable("id") int id) {
		productoService.remove(id);
		return new RedirectView(ViewRouteHelper.PRODUCTO_ROOT);
	}
}
