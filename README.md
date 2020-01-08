# AmazonSQSConnector

Welcome to the Mendix AmazonSQSConnector module. This module can be used in [Mendix](http://www.mendix.com) apps connect with [Amazon Simple Queue Service](https://aws.amazon.com/sqs/).

![logo][1]

# Table of Contents

* [Getting Started](#getting-started)
* [Features](#features)
* [Logging](#logging)
* [Dependencies](#dependencies)
* [Development notes](#development-notes)

# Getting started
1. Install the Mendix AmazonSQSConnector from the Mendix App Store in your project.
2. Configure the ACCESS_KEY_ID and SECRET_ACCESS_KEY credentials from your Amazon account.
3. Use the microflows and actions in the _USE_ME folder.

# Features
* Create queue with empty permission set
* Create queue with permissions (everyone can read and delete, owner can publish)
* Send message
* Receive messages (max 10)
* Delete message
* Delete messages in batch
* Multi-threaded background polling for new messages

# Logging
* The *AmazonSQSConnector* log node is available for logging. Set to Debug or Trace for more details.

# Dependencies
* com.amazonaws/aws-java-sdk-sqs and its dependencies

# Development notes

## Build
Apache Maven and Ant are used to manage dependencies, copy those in the userlib folder and create the module package. To collect dependencies in the userlib folder, make sure Maven is installed and run the command below.
```
mvn clean package
```
To create a module package in the releases folder, run the following command:
```
mvn clean install
```

## Contributions
* For contributions, fork the repository, make changes, fix unit tests with 100% coverage and issue a pull request to the develop branch (Gitflow).
* To report bugs or request features, please open an issue in the repository.

 [1]: docs/logo.png
