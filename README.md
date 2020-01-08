# AmazonSQSConnector

Welcome to the Mendix AmazonSQSConnector module. This module can be used in [Mendix](http://www.mendix.com) apps connect with [Amazon Simple Queue Service](https://aws.amazon.com/sqs/).

![logo][1]

# Table of Contents

* [Getting Started](#getting-started)
* [Features](#features)
* [Job configuration](#job-configuration)
* [Security roles](#security-roles)
* [Not implemented](#not-implemented)
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
No userlib compile dependencies.

# Development notes
* For contributions, fork the repository, make changes, fix unit tests with 100% coverage and issue a pull request to the develop branch (Gitflow).
* To report bugs or request features, please open an issue in the repository.

 [1]: docs/logo.png
