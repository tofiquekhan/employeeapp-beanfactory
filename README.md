# employeeapp-beanfactory

IOC Containers(Inversion of Control)

The main intention of IOC Container is to read bean configurations from configuration file, create Bean Objects and Provide Bean Object to Spring Applications.

There are Two Types of IOC Container in Spring Framework.

1. BeanFactory (Deprecated)
2. ApplicationContext

1. BeanFactory : 
	A. It is Basic / Fundamental container to create Bean Object in Spring Applications.
	B. It provide Basic Funtionalities but not advance functinality like I18N & Event Notification Mode etc.
  C. BeanFactory IOC Container is provided in the form of Interface "org.springframework.beans.factory.BeanFactory"
  D. Spring Framework provided an implementation class of BeanFactory in form of "org.springframework.bean.xml.XmlBeanFactory"
  
Step to Use BeanFactory
  1. Create Resource Object.
  2. Create BeanFactory Object.
  3. Get Bean Object & Access Business Methods.
  
Resource : Resource is an Object in Spring Framework, It represent all bean configuration details which we provided in beans configuration details.
It is provide in the form of Interface "org.springframework.core.io.Resource"

Implementation Class of Resouce :
1. ByteArrayResource
2. FileSystemResource
3. ClassPathResource
4. InputStreamResource
5. UrlResource
6. ServletContextResource
7. PortletContextResource
