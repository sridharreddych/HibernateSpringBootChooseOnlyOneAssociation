**[How To Ensure/Validate That Only One Association Is Non-Null](https://github.com/AnghelLeonard/Hibernate-SpringBoot/tree/master/HibernateSpringBootChooseOnlyOneAssociation)**
 
 **Description:** Consider an entity named `Review`. This entity defines three `@ManyToOne` relationships to `Book`, `Article` and `Magazine`. A review can be associated with either a book, a magazine or an article. To validate this constraint, we can rely on  [Bean Validation](https://beanvalidation.org/) as in this application.

**Key points:**
- rely on Bean Validation to validate that only one association is non-`null`
- expose the constraint via a custom annotation (`@JustOneOfMany`) added at class-level to the `Review` entity
- for preventing native query to break our constraint add the validation at database level as well (e.g., in MySQL add a `TRIGGER`)
     
-----------------------------------------------------------------------------------------------------------------------    
<table>
     <tr><td><b>If you need a deep dive into the performance recipes exposed in this repository then I am sure that you will love my book "Spring Boot Persistence Best Practices"</b></td><td><b>If you need a hand of tips and illustrations of 100+ Java persistence performance issues then "Java Persistence Performance Illustrated Guide" is for you.</b></td></tr>
     <tr><td>
<a href="https://www.apress.com/us/book/9781484256251"><p align="left"><img src="https://github.com/AnghelLeonard/Hibernate-SpringBoot/blob/master/Spring%20Boot%20Persistence%20Best%20Practices.jpg" height="500" width="450"/></p></a>
</td><td>
<a href="https://leanpub.com/java-persistence-performance-illustrated-guide"><p align="right"><img src="https://github.com/AnghelLeonard/Hibernate-SpringBoot/blob/master/Java%20Persistence%20Performance%20Illustrated%20Guide.jpg" height="500" width="450"/></p></a>
</td></tr></table>

-----------------------------------------------------------------------------------------------------------------------    

# HibernateSpringBootChooseOnlyOneAssociation
