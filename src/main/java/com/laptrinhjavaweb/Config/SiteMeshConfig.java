package com.laptrinhjavaweb.Config;

import org.sitemesh.builder.SiteMeshFilterBuilder;
import org.sitemesh.config.ConfigurableSiteMeshFilter;
import org.springframework.context.annotation.Configuration;


public class SiteMeshConfig extends ConfigurableSiteMeshFilter {
	@Override
	protected void applyCustomConfiguration(SiteMeshFilterBuilder builder) {
		builder
		.addDecoratorPath("/*", "/decorators/Web.jsp")
		.addDecoratorPath("/profiles/*", "/decorators/Web.jsp")
		
		// tất cả các link (/admin/**) đều vào layout của admin.
		.addDecoratorPath("/admin/*", "/decorators/Admin.jsp")
		
		
		// Exclude few paths from decoration.
        .addExcludedPath("/decorators/Login.jsp"); // trang login không cần phải thực hiện layout.
	}
}
