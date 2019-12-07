package com.laptrinhjavaweb.config;

import org.sitemesh.builder.SiteMeshFilterBuilder;
import org.sitemesh.config.ConfigurableSiteMeshFilter;

public class SiteMeshConfig extends ConfigurableSiteMeshFilter {
	@Override
	protected void applyCustomConfiguration(SiteMeshFilterBuilder builder) {
		builder
		.addDecoratorPath("/", "/decorators/web.jsp")
		.addDecoratorPath("/home/*", "/decorators/web.jsp")
		
		// tất cả các link (/admin/**) đều vào layout của admin.
		.addDecoratorPath("/admin/*", "/decorators/admin.jsp")
		.addDecoratorPath("/admin", "/decorators/admin.jsp")
		
		
		// Exclude few paths from decoration.
        .addExcludedPath("/login")
        .addExcludedPath("/error/*")
        .addExcludedPath("/cart")
        .addExcludedPath("/checkout")
        .addExcludedPath("/contact")
        .addExcludedPath("/single_product");
	}
}
