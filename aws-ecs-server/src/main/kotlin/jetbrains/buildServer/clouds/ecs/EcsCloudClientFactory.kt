package jetbrains.buildServer.clouds.ecs

import jetbrains.buildServer.clouds.CloudClientEx
import jetbrains.buildServer.clouds.CloudClientFactory
import jetbrains.buildServer.clouds.CloudClientParameters
import jetbrains.buildServer.clouds.CloudState
import jetbrains.buildServer.serverSide.AgentDescription
import jetbrains.buildServer.serverSide.PropertiesProcessor

/**
 * Created by Evgeniy Koshkin (evgeniy.koshkin@jetbrains.com) on 05.07.17.
 */
class EcsCloudClientFactory : CloudClientFactory {
    override fun getInitialParameterValues(): MutableMap<String, String> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun canBeAgentOfType(description: AgentDescription): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getDisplayName(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getEditProfileUrl(): String? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun createNewClient(state: CloudState, params: CloudClientParameters): CloudClientEx {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getCloudCode(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getPropertiesProcessor(): PropertiesProcessor {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}