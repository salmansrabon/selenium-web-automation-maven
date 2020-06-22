# selenium-web-automation

## Technology:
- Tool: selenium
- IDE: IntelIJ
- Build tool: Maven
- Language: Java

## Requirement:
1. Navigate to an ecommerce site
2. Register a customer account with unique email
3. Login to customer account
4. Search for an item by typing 'dress' on search box
5. Add to cart
6. Checkout item
7. Assert with purchase confirmation message

## Prerequisite:
1. Need to install jdk 1.8
2. Need good internet connectivity

## Run the automation script:
1. Open cmd to the project folder
2. Type this command:

```sh
mvn clean test
```
3. Selenium will open the browser and start automation.
4. To view report, type this command:
```sh
allure generate allure-results --clean -o allure-report
allure serve allure-results
```
## Report View
![alluresult](https://user-images.githubusercontent.com/48891202/85247973-5c3c9600-b471-11ea-9c8e-6f344fe9b6eb.png)

![allureresult2](https://user-images.githubusercontent.com/48891202/85248002-68c0ee80-b471-11ea-98ae-3a751383d356.png)

You will find the automation <a href="https://youtu.be/VzlgCcbHZWU" target="_blank">video</a> here.
