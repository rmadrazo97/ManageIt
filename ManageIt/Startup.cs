using Microsoft.Owin;
using Owin;

[assembly: OwinStartupAttribute(typeof(ManageIt.Startup))]
namespace ManageIt
{
    public partial class Startup
    {
        public void Configuration(IAppBuilder app)
        {
            ConfigureAuth(app);
        }
    }
}
