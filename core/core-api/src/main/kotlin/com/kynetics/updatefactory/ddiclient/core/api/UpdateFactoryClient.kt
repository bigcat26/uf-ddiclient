package com.kynetics.updatefactory.ddiclient.core.api

interface UpdateFactoryClient {

    fun init(
        updateFactoryClientData: UpdateFactoryClientData,
        directoryForArtifactsProvider: DirectoryForArtifactsProvider,
        configDataProvider: ConfigDataProvider,
        deploymentPermitProvider: DeploymentPermitProvider,
        messageListeners: List<MessageListener>,
        vararg updaters: Updater
    )

    fun startAsync()

    fun stop()

    fun forcePing()
}
